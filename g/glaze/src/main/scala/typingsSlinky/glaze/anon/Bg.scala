package typingsSlinky.glaze.anon

import typingsSlinky.glaze.glazeStrings.background
import typingsSlinky.glaze.glazeStrings.margin
import typingsSlinky.glaze.glazeStrings.marginBottom
import typingsSlinky.glaze.glazeStrings.marginLeft
import typingsSlinky.glaze.glazeStrings.marginRight
import typingsSlinky.glaze.glazeStrings.marginTop
import typingsSlinky.glaze.glazeStrings.marginX
import typingsSlinky.glaze.glazeStrings.marginY
import typingsSlinky.glaze.glazeStrings.padding
import typingsSlinky.glaze.glazeStrings.paddingBottom
import typingsSlinky.glaze.glazeStrings.paddingLeft
import typingsSlinky.glaze.glazeStrings.paddingRight
import typingsSlinky.glaze.glazeStrings.paddingTop
import typingsSlinky.glaze.glazeStrings.paddingX
import typingsSlinky.glaze.glazeStrings.paddingY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bg extends js.Object {
  
  val bg: background = js.native
  
  val m: margin = js.native
  
  val mb: marginBottom = js.native
  
  val ml: marginLeft = js.native
  
  val mr: marginRight = js.native
  
  val mt: marginTop = js.native
  
  val mx: marginX = js.native
  
  val my: marginY = js.native
  
  val p: padding = js.native
  
  val pb: paddingBottom = js.native
  
  val pl: paddingLeft = js.native
  
  val pr: paddingRight = js.native
  
  val pt: paddingTop = js.native
  
  val px: paddingX = js.native
  
  val py: paddingY = js.native
}
object Bg {
  
  @scala.inline
  def apply(
    bg: background,
    m: margin,
    mb: marginBottom,
    ml: marginLeft,
    mr: marginRight,
    mt: marginTop,
    mx: marginX,
    my: marginY,
    p: padding,
    pb: paddingBottom,
    pl: paddingLeft,
    pr: paddingRight,
    pt: paddingTop,
    px: paddingX,
    py: paddingY
  ): Bg = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mb = mb.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], mr = mr.asInstanceOf[js.Any], mt = mt.asInstanceOf[js.Any], mx = mx.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], pb = pb.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], pr = pr.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bg]
  }
  
  @scala.inline
  implicit class BgOps[Self <: Bg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBg(value: background): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: margin): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMb(value: marginBottom): Self = this.set("mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMl(value: marginLeft): Self = this.set("ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMr(value: marginRight): Self = this.set("mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMt(value: marginTop): Self = this.set("mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMx(value: marginX): Self = this.set("mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMy(value: marginY): Self = this.set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: padding): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPb(value: paddingBottom): Self = this.set("pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPl(value: paddingLeft): Self = this.set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPr(value: paddingRight): Self = this.set("pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPt(value: paddingTop): Self = this.set("pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPx(value: paddingX): Self = this.set("px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPy(value: paddingY): Self = this.set("py", value.asInstanceOf[js.Any])
  }
}
