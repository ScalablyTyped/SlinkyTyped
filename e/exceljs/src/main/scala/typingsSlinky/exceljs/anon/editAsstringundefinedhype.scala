package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.mod.Anchor
import typingsSlinky.exceljs.mod.ImageHyperlinkValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  editAs :string | undefined,   hyperlinks :exceljs.exceljs.ImageHyperlinkValue | undefined} & exceljs.exceljs.ImageRange */
@js.native
trait editAsstringundefinedhype extends StObject {
  
  var br: Anchor = js.native
  
  var editAs: js.UndefOr[String] = js.native
  
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.native
  
  var tl: Anchor = js.native
}
object editAsstringundefinedhype {
  
  @scala.inline
  def apply(br: Anchor, tl: Anchor): editAsstringundefinedhype = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringundefinedhype]
  }
  
  @scala.inline
  implicit class editAsstringundefinedhypeMutableBuilder[Self <: editAsstringundefinedhype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBr(value: Anchor): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditAs(value: String): Self = StObject.set(x, "editAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditAsUndefined: Self = StObject.set(x, "editAs", js.undefined)
    
    @scala.inline
    def setHyperlinks(value: ImageHyperlinkValue): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
    
    @scala.inline
    def setTl(value: Anchor): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
  }
}
