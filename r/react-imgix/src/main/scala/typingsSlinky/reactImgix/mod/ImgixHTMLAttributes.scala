package typingsSlinky.reactImgix.mod

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.react.mod.SourceHTMLAttributes
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ImgHTMLAttributes[typingsSlinky.std.HTMLImageElement]
  - typingsSlinky.react.mod.SourceHTMLAttributes[typingsSlinky.std.HTMLSourceElement]
  - typingsSlinky.std.Record[java.lang.String, java.lang.String]
*/
trait ImgixHTMLAttributes extends js.Object

object ImgixHTMLAttributes {
  @scala.inline
  implicit def apply(value: ImgHTMLAttributes[HTMLImageElement]): ImgixHTMLAttributes = value.asInstanceOf[ImgixHTMLAttributes]
  @scala.inline
  implicit def apply(value: Record[String, String]): ImgixHTMLAttributes = value.asInstanceOf[ImgixHTMLAttributes]
  @scala.inline
  implicit def apply(value: SourceHTMLAttributes[HTMLSourceElement]): ImgixHTMLAttributes = value.asInstanceOf[ImgixHTMLAttributes]
}

