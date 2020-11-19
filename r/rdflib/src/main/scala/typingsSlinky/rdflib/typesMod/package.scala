package typingsSlinky.rdflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Bindings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rdflib.tfTypesMod.Term]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdflib.tfTypesMod.Term
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.rdflib.collectionMod.default[C]
  */
  type FromValueReturns[C /* <: typingsSlinky.rdflib.nodeInternalMod.default */] = js.UndefOr[typingsSlinky.rdflib.typesMod._FromValueReturns[C] | scala.Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdflib.namedNodeMod.default
    - typingsSlinky.rdflib.literalMod.default
    - typingsSlinky.rdflib.collectionMod.default[
  typingsSlinky.rdflib.nodeInternalMod.default | typingsSlinky.rdflib.blankNodeMod.default | typingsSlinky.rdflib.collectionMod.Collection[js.Any] | typingsSlinky.rdflib.literalMod.default | typingsSlinky.rdflib.variableMod.default]
    - typingsSlinky.rdflib.blankNodeMod.default
    - typingsSlinky.rdflib.variableMod.default
    - typingsSlinky.rdflib.emptyMod.default
  */
  type ObjectType = typingsSlinky.rdflib.typesMod._ObjectType | (typingsSlinky.rdflib.collectionMod.default[
    typingsSlinky.rdflib.nodeInternalMod.default | typingsSlinky.rdflib.blankNodeMod.default | typingsSlinky.rdflib.collectionMod.Collection[js.Any] | typingsSlinky.rdflib.literalMod.default | typingsSlinky.rdflib.variableMod.default
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rdflib.tfTypesMod.Term
    - typingsSlinky.rdflib.nodeInternalMod.default
    - typingsSlinky.std.Date
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.rdflib.collectionMod.default[
  typingsSlinky.rdflib.nodeInternalMod.default | typingsSlinky.rdflib.blankNodeMod.default | typingsSlinky.rdflib.collectionMod.Collection[js.Any] | typingsSlinky.rdflib.literalMod.default | typingsSlinky.rdflib.variableMod.default]
  */
  type ValueType = js.UndefOr[
    typingsSlinky.rdflib.typesMod._ValueType | (typingsSlinky.rdflib.collectionMod.default[
      typingsSlinky.rdflib.nodeInternalMod.default | typingsSlinky.rdflib.blankNodeMod.default | typingsSlinky.rdflib.collectionMod.Collection[js.Any] | typingsSlinky.rdflib.literalMod.default | typingsSlinky.rdflib.variableMod.default
    ]) | js.Date | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
}
