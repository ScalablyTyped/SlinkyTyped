package typingsSlinky.reactMdMaterialIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdIcon.svgiconMod.SVGIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PublicSVGIcon {
  @JSImport("@react-md/material-icons", "PublicSVGIcon")
  @js.native
  object component extends js.Object
  
  def withProps(p: SVGIconProps with RefAttributes[SVGSVGElement]): SharedBuilder_SVGIconPropsRefAttributes_1547990045[SVGSVGElement] = new SharedBuilder_SVGIconPropsRefAttributes_1547990045[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PublicSVGIcon.type): SharedBuilder_SVGIconPropsRefAttributes_1547990045[SVGSVGElement] = new SharedBuilder_SVGIconPropsRefAttributes_1547990045[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
}

