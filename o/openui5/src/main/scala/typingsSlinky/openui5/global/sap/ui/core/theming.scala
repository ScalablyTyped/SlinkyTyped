package typingsSlinky.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.theming")
@js.native
object theming extends js.Object {
  
  @js.native
  object Parameters extends js.Object {
    
    /**
      * Returns the current value for one or more theming parameters, depending on the given
      * arguments.<ul><li>If no parameter is given a key-value map containing all parameters is
      * returned</li><li>If a <code>string</code> is given as first parameter the value is returned as a
      * <code>string</code></li><li>If an <code>array</code> is given as first parameter a key-value map
      * containing all parameters from the <code>array</code> is returned</li></ul><p>The returned key-value
      * maps are a copy so changing values in the map does not have any effect</p>
      * @param vName the (array with) CSS parameter name(s)
      * @param oElement Element / control instance to take into account when looking for a parameter value. 
      *                         This can make a difference when a parameter value is overridden in a theme
      * scope set via a CSS class.
      * @returns the CSS parameter value(s)
      */
    def get(vName: String): String | js.Any = js.native
    def get(vName: String, oElement: typingsSlinky.openui5.sap.ui.core.Element): String | js.Any = js.native
    def get(vName: js.Array[String]): String | js.Any = js.native
    def get(vName: js.Array[String], oElement: typingsSlinky.openui5.sap.ui.core.Element): String | js.Any = js.native
    
    /**
      * Returns the active scope(s) for a given control by looking up the hierarchy.The lookup navigates the
      * DOM hierarchy if it's available. Otherwise if controls aren't rendered yet,it navigates the control
      * hierarchy. By navigating the control hierarchy, inner-html elementswith the respective scope classes
      * can't get recognized as the Custom Style Class API does only forroot elements.
      * @param oElement element/control instance
      * @returns Two dimensional array with scopes in bottom up order
      */
    def getActiveScopesFor(oElement: js.Any): js.Array[js.Array[String]] = js.native
    
    /**
      * Returns the scopes from current theming parameters.
      * @param bAvoidLoading Whether loading of parameters should be avoided
      * @returns Scope names
      */
    @JSName("_getScopes")
    def getScopes(bAvoidLoading: Boolean): js.Array[_] = js.native
    
    /**
      * Resets the CSS parameters which finally will reload the parametersthe next time they are queried via
      * the method <code>get</code>.
      */
    def reset(): Unit = js.native
  }
}
