package typingsSlinky.jscodeshift.jsxelementMod

import typingsSlinky.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalMethods extends js.Object {
  
  /**
    * Finds all JSXElements optionally filtered by name
    */
  def findJSXElements(): Collection[JSXElement] = js.native
  def findJSXElements(name: String): Collection[JSXElement] = js.native
  
  /**
    * Finds all JSXElements by module name. Given
    *
    *     var Bar = require('Foo');
    *     <Bar />
    *
    * findJSXElementsByModuleName('Foo') will find <Bar />, without having to
    * know the variable name.
    */
  def findJSXElementsByModuleName(moduleName: String): Collection[JSXElement] = js.native
}
