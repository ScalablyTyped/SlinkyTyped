package typingsSlinky.rax.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * props * / P, 
(typingsSlinky.rax.mod.RaxElement[
  js.Any, 
  java.lang.String | (/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias rax.rax.JSXElementConstructor<any> * / js.Object)
]) | scala.Null]
  - org.scalablytyped.runtime.Instantiable1[/ * props * / P, typingsSlinky.rax.mod.Component[P, js.Any, js.Any]]
*/
trait JSXElementConstructor[P] extends js.Object

object JSXElementConstructor {
  @scala.inline
  implicit def apply[P](
    value: js.Function1[
      /* props */ P, 
      (RaxElement[
        js.Any, 
        String | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias rax.rax.JSXElementConstructor<any> */ js.Object)
      ]) | Null
    ]
  ): JSXElementConstructor[P] = value.asInstanceOf[JSXElementConstructor[P]]
  @scala.inline
  implicit def apply[P](value: Instantiable1[/* props */ P, Component[P, js.Any, js.Any]]): JSXElementConstructor[P] = value.asInstanceOf[JSXElementConstructor[P]]
}

