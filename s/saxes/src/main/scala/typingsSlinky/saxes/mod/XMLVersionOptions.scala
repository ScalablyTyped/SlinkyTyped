package typingsSlinky.saxes.mod

import typingsSlinky.saxes.saxesStrings.`1Dot0`
import typingsSlinky.saxes.saxesStrings.`1Dot1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLVersionOptions extends StObject {
  
  /**
    * The default XML version to use. If unspecified, and there is no XML
    * encoding declaration, the default version is "1.0".
    */
  var defaultXMLVersion: js.UndefOr[`1Dot0` | `1Dot1`] = js.native
  
  /**
    * A flag indicating whether to force the XML version used for parsing to the
    * value of ``defaultXMLVersion``. When this flag is ``true``,
    * ``defaultXMLVersion`` must be specified. If unspecified, the default value
    * of this flag is ``false``.
    */
  var forceXMLVersion: js.UndefOr[Boolean] = js.native
}
object XMLVersionOptions {
  
  @scala.inline
  def apply(): XMLVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLVersionOptions]
  }
  
  @scala.inline
  implicit class XMLVersionOptionsMutableBuilder[Self <: XMLVersionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultXMLVersion(value: `1Dot0` | `1Dot1`): Self = StObject.set(x, "defaultXMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultXMLVersionUndefined: Self = StObject.set(x, "defaultXMLVersion", js.undefined)
    
    @scala.inline
    def setForceXMLVersion(value: Boolean): Self = StObject.set(x, "forceXMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceXMLVersionUndefined: Self = StObject.set(x, "forceXMLVersion", js.undefined)
  }
}
