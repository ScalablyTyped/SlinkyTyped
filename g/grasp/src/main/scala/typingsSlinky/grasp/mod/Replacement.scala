package typingsSlinky.grasp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function4[
/ * getRaw * / js.Function1[/ * node * / typingsSlinky.estree.mod.Node, java.lang.String], 
/ * node * / typingsSlinky.estree.mod.Node, 
/ * query * / js.Function1[/ * q * / java.lang.String, js.Array[typingsSlinky.estree.mod.Node]], 
/ * named * / org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.estree.mod.Node], 
java.lang.String]
*/
trait Replacement extends js.Object

object Replacement {
  @scala.inline
  implicit def apply(
    value: js.Function4[
      /* getRaw */ js.Function1[/* node */ Node, String], 
      /* node */ Node, 
      /* query */ js.Function1[/* q */ String, js.Array[Node]], 
      /* named */ StringDictionary[String | Node], 
      String
    ]
  ): Replacement = value.asInstanceOf[Replacement]
  @scala.inline
  implicit def apply(value: String): Replacement = value.asInstanceOf[Replacement]
}

