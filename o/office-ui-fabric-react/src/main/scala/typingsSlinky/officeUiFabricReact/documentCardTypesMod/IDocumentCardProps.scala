package typingsSlinky.officeUiFabricReact.documentCardTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Event_
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardProps
  extends HTMLAttributes[HTMLDivElement]
     with IBaseProps[IDocumentCard] {
  /**
    * Hex color value of the line below the card, which should correspond to the document type.
    * This should only be supplied when using the 'compact' card layout.
    *
    * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
    * @deprecated To be removed at v5.0.0.
    */
  var accentColor: js.UndefOr[String] = js.native
  /**
    * A URL to navigate to when the card is clicked. If a function has also been provided,
    * it will be used instead of the URL.
    */
  var onClickHref: js.UndefOr[String] = js.native
  /**
    * Function to call when the card is clicked or keyboard Enter/Space is pushed.
    */
  @JSName("onClick")
  var onClick_IDocumentCardProps: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * The type of DocumentCard to display.
    * @defaultvalue DocumentCardType.normal
    */
  var `type`: js.UndefOr[DocumentCardType] = js.native
}

object IDocumentCardProps {
  @scala.inline
  def apply(): IDocumentCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardProps]
  }
  @scala.inline
  implicit class IDocumentCardPropsOps[Self <: IDocumentCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* ev */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClickHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickHref")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDocumentCardStyleProps => Partial[IDocumentCardStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DocumentCardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

