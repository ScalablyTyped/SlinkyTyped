package typingsSlinky.instagramPrivateApi.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.music
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.text_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.QuestionSticker> */
@js.native
trait StickerOptionsQuestionSti extends StObject {
  
  var additionalConfigureProperties: js.UndefOr[js.Function0[_]] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var bottom: js.UndefOr[js.Function0[this.type]] = js.native
  
  var center: js.UndefOr[js.Function0[this.type]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[js.Function0[String]] = js.native
  
  var isSticker: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[js.Function0[String]] = js.native
  
  var left: js.UndefOr[js.Function0[this.type]] = js.native
  
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  
  var profilePicUrl: js.UndefOr[String] = js.native
  
  var question: String = js.native
  
  var questionType: js.UndefOr[text_ | music] = js.native
  
  var right: js.UndefOr[js.Function0[this.type]] = js.native
  
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.native
  
  var textColor: js.UndefOr[String] = js.native
  
  var toJSON: js.UndefOr[js.Function0[StringDictionary[_]]] = js.native
  
  var top: js.UndefOr[js.Function0[this.type]] = js.native
  
  var viewerCanInteract: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var z: js.UndefOr[Double] = js.native
}
object StickerOptionsQuestionSti {
  
  @scala.inline
  def apply(question: String): StickerOptionsQuestionSti = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerOptionsQuestionSti]
  }
  
  @scala.inline
  implicit class StickerOptionsQuestionStiMutableBuilder[Self <: StickerOptionsQuestionSti] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalConfigureProperties(value: () => _): Self = StObject.set(x, "additionalConfigureProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAdditionalConfigurePropertiesUndefined: Self = StObject.set(x, "additionalConfigureProperties", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBottom(value: () => StickerOptionsQuestionSti): Self = StObject.set(x, "bottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setCenter(value: () => StickerOptionsQuestionSti): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsSticker(value: Boolean): Self = StObject.set(x, "isSticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStickerUndefined: Self = StObject.set(x, "isSticker", js.undefined)
    
    @scala.inline
    def setKey(value: () => String): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLeft(value: () => StickerOptionsQuestionSti): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMoveBackwards(value: /* layers */ js.UndefOr[Double] => StickerOptionsQuestionSti): Self = StObject.set(x, "moveBackwards", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveBackwardsUndefined: Self = StObject.set(x, "moveBackwards", js.undefined)
    
    @scala.inline
    def setMoveForward(value: /* layers */ js.UndefOr[Double] => StickerOptionsQuestionSti): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    
    @scala.inline
    def setProfilePicUrl(value: String): Self = StObject.set(x, "profilePicUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilePicUrlUndefined: Self = StObject.set(x, "profilePicUrl", js.undefined)
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionType(value: text_ | music): Self = StObject.set(x, "questionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionTypeUndefined: Self = StObject.set(x, "questionType", js.undefined)
    
    @scala.inline
    def setRight(value: () => StickerOptionsQuestionSti): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setRotateDeg(value: /* deg */ Double => StickerOptionsQuestionSti): Self = StObject.set(x, "rotateDeg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotateDegUndefined: Self = StObject.set(x, "rotateDeg", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: /* factor */ Double => StickerOptionsQuestionSti): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setToJSON(value: () => StringDictionary[_]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    @scala.inline
    def setTop(value: () => StickerOptionsQuestionSti): Self = StObject.set(x, "top", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setViewerCanInteract(value: Boolean): Self = StObject.set(x, "viewerCanInteract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerCanInteractUndefined: Self = StObject.set(x, "viewerCanInteract", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
