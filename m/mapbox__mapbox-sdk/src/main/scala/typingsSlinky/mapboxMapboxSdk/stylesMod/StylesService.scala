package typingsSlinky.mapboxMapboxSdk.stylesMod

import typingsSlinky.mapboxMapboxSdk.AnonConfig
import typingsSlinky.mapboxMapboxSdk.AnonEnd
import typingsSlinky.mapboxMapboxSdk.AnonFile
import typingsSlinky.mapboxMapboxSdk.AnonFormat
import typingsSlinky.mapboxMapboxSdk.AnonIconId
import typingsSlinky.mapboxMapboxSdk.AnonLastKnownModification
import typingsSlinky.mapboxMapboxSdk.AnonOwnerId
import typingsSlinky.mapboxMapboxSdk.AnonStart
import typingsSlinky.mapboxMapboxSdk.AnonStyle
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesService extends js.Object {
  /**
    * Create a style.
    * @param style
    * @param ownerId
    */
  def createStyle(config: AnonStyle): MapiRequest = js.native
  /**
    * Delete a style.
    * @param style
    * @param ownerId
    */
  def deleteStyle(config: AnonStyle): MapiRequest = js.native
  /**
    * Remove an icon from a style.
    * @param styleId
    * @param iconId
    * @param ownerId
    */
  // implicit any
  def deleteStyleIcon(config: AnonIconId): Unit = js.native
  /**
    * Get embeddable HTML displaying a map.
    * @param config
    * @param styleId
    * @param scrollZoom
    * @param title
    * @param ownerId
    */
  def getEmbeddableHtml(config: AnonConfig): MapiRequest = js.native
  /**
    * Get a font glyph range.
    * @param fonts
    * @param start
    * @param end
    * @param ownerId
    */
  def getFontGlyphRange(config: AnonEnd): MapiRequest = js.native
  /**
    * Get a style.
    * @param styleId
    * @param ownerId
    */
  def getStyle(config: AnonOwnerId): MapiRequest = js.native
  /**
    * Get a style sprite's image or JSON document.
    * @param styleId
    * @param format
    * @param highRes
    * @param ownerId
    */
  def getStyleSprite(config: AnonFormat): MapiRequest = js.native
  /**
    * List styles in your account.
    * @param start
    * @param ownerId
    */
  def listStyles(config: AnonStart): MapiRequest = js.native
  /**
    * Add an icon to a style, or update an existing one.
    * @param styleId
    * @param iconId
    * @param file
    * @param ownerId
    */
  def putStyleIcon(config: AnonFile): MapiRequest = js.native
  /**
    * Update a style.
    * @param styleId
    * @param style
    * @param lastKnownModification
    * @param ownerId
    */
  // implicit any
  def updateStyle(config: AnonLastKnownModification): Unit = js.native
}

object StylesService {
  @scala.inline
  def apply(
    createStyle: AnonStyle => MapiRequest,
    deleteStyle: AnonStyle => MapiRequest,
    deleteStyleIcon: AnonIconId => Unit,
    getEmbeddableHtml: AnonConfig => MapiRequest,
    getFontGlyphRange: AnonEnd => MapiRequest,
    getStyle: AnonOwnerId => MapiRequest,
    getStyleSprite: AnonFormat => MapiRequest,
    listStyles: AnonStart => MapiRequest,
    putStyleIcon: AnonFile => MapiRequest,
    updateStyle: AnonLastKnownModification => Unit
  ): StylesService = {
    val __obj = js.Dynamic.literal(createStyle = js.Any.fromFunction1(createStyle), deleteStyle = js.Any.fromFunction1(deleteStyle), deleteStyleIcon = js.Any.fromFunction1(deleteStyleIcon), getEmbeddableHtml = js.Any.fromFunction1(getEmbeddableHtml), getFontGlyphRange = js.Any.fromFunction1(getFontGlyphRange), getStyle = js.Any.fromFunction1(getStyle), getStyleSprite = js.Any.fromFunction1(getStyleSprite), listStyles = js.Any.fromFunction1(listStyles), putStyleIcon = js.Any.fromFunction1(putStyleIcon), updateStyle = js.Any.fromFunction1(updateStyle))
    __obj.asInstanceOf[StylesService]
  }
  @scala.inline
  implicit class StylesServiceOps[Self <: StylesService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateStyle(value: AnonStyle => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteStyle(value: AnonStyle => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteStyleIcon(value: AnonIconId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteStyleIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEmbeddableHtml(value: AnonConfig => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmbeddableHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFontGlyphRange(value: AnonEnd => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontGlyphRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStyle(value: AnonOwnerId => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStyleSprite(value: AnonFormat => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleSprite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListStyles(value: AnonStart => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPutStyleIcon(value: AnonFile => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putStyleIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateStyle(value: AnonLastKnownModification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStyle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

