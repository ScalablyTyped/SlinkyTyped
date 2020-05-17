package typingsSlinky.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NumberLiteral = typingsSlinky.babelTypes.mod.NumericLiteral_
  type RegexLiteral = typingsSlinky.babelTypes.mod.RegExpLiteral_
  type RestProperty = typingsSlinky.babelTypes.mod.RestElement_
  type SpreadProperty = typingsSlinky.babelTypes.mod.SpreadElement_
  type TraversalAncestors = js.Array[typingsSlinky.babelTypes.anon.Index]
  type TraversalHandler[T] = js.ThisFunction3[
    /* this */ js.UndefOr[scala.Nothing], 
    /* node */ typingsSlinky.babelTypes.mod.Node, 
    /* parent */ typingsSlinky.babelTypes.mod.TraversalAncestors, 
    /* type */ T, 
    scala.Unit
  ]
}
