package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IRange
import typingsSlinky.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationLink extends StObject {
  
  /**
    * A range to select where this link originates from.
    */
  var originSelectionRange: js.UndefOr[IRange] = js.native
  
  /**
    * The full range this link points to.
    */
  var range: IRange = js.native
  
  /**
    * A range to select this link points to. Must be contained
    * in `LocationLink.range`.
    */
  var targetSelectionRange: js.UndefOr[IRange] = js.native
  
  /**
    * The target uri this link points to.
    */
  var uri: Uri = js.native
}
object LocationLink {
  
  @scala.inline
  def apply(range: IRange, uri: Uri): LocationLink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
  
  @scala.inline
  implicit class LocationLinkMutableBuilder[Self <: LocationLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginSelectionRange(value: IRange): Self = StObject.set(x, "originSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginSelectionRangeUndefined: Self = StObject.set(x, "originSelectionRange", js.undefined)
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectionRange(value: IRange): Self = StObject.set(x, "targetSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectionRangeUndefined: Self = StObject.set(x, "targetSelectionRange", js.undefined)
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
