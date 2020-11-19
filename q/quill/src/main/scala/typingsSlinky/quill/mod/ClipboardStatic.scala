package typingsSlinky.quill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardStatic extends js.Object {
  
  def addMatcher(
    selectorOrNodeType: String,
    callback: js.Function2[
      /* node */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ _
    ]
  ): Unit = js.native
  def addMatcher(
    selectorOrNodeType: Double,
    callback: js.Function2[
      /* node */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ _
    ]
  ): Unit = js.native
  
  def convert(): js.Any = js.native
  def convert(html: String): js.Any = js.native
  
  def dangerouslyPasteHTML(html: String): Unit = js.native
  def dangerouslyPasteHTML(html: String, source: Sources): Unit = js.native
  def dangerouslyPasteHTML(index: Double, html: String): Unit = js.native
  def dangerouslyPasteHTML(index: Double, html: String, source: Sources): Unit = js.native
}
