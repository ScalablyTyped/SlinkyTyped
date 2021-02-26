package typingsSlinky.angularMaterial.mod.angularAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object material {
  
  type IColorExpression = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type IIcon = js.Function1[
    /* id */ java.lang.String, 
    typingsSlinky.angular.mod.IPromise[org.scalajs.dom.raw.Element]
  ]
  
  type IMedia = js.Function1[/* media */ java.lang.String, scala.Boolean]
  
  type IStickyService = js.Function3[
    /* scope */ typingsSlinky.angular.mod.IScope, 
    /* element */ typingsSlinky.angular.JQuery, 
    /* elementClone */ js.UndefOr[typingsSlinky.angular.JQuery], 
    scala.Unit
  ]
  
  type ResolveObject = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.angular.mod.Injectable[js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]]
  ]
}
