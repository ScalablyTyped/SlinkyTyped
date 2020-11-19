package typingsSlinky.amapJsApi.global.AMap

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.MediaLayer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.MediaLayer")
@js.native
/**
  * @param options 图层选项
  */
abstract class MediaLayer[E /* <: HTMLElement */] ()
  extends typingsSlinky.amapJsApi.AMap.MediaLayer[E] {
  def this(options: Options) = this()
}
