package typingsSlinky.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicDoc = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = slinky.core.ReactComponentClass[
    (typingsSlinky.reactInstantsearchCore.mod.Omit[TProps, TProvidedProps]) with TExposedProps
  ]
  
  type ConnectorProvided[TProvided] = typingsSlinky.reactInstantsearchCore.anon.CreateURL with TProvided
  
  type HighlightProps[TDoc] = typingsSlinky.reactInstantsearchCore.mod.HighlightProvided[TDoc] with typingsSlinky.reactInstantsearchCore.mod.HighlightPassedThru[TDoc]
  
  type HighlightResult[TDoc] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.HighlightResult with org.scalablytyped.runtime.TopLevel[TDoc]
  
  type HighlightResultArray[TItem] = js.Array[
    typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TItem] | typingsSlinky.reactInstantsearchCore.mod.HighlightResultPrimitive
  ]
  
  type HighlightResultField[TField] = typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TField] | typingsSlinky.reactInstantsearchCore.mod.HighlightResultPrimitive | typingsSlinky.reactInstantsearchCore.mod.HighlightResultArray[js.Any]
  
  type Hit[TDoc] = TDoc with typingsSlinky.reactInstantsearchCore.anon.HighlightResult[TDoc]
  
  type Omit[T1, T2] = typingsSlinky.std.Pick[
    T1, 
    typingsSlinky.std.Exclude[/* keyof T1 */ java.lang.String, /* keyof T2 */ java.lang.String]
  ]
  
  type Refinement = typingsSlinky.reactInstantsearchCore.anon.Attribute with (typingsSlinky.reactInstantsearchCore.anon.CurrentRefinement | typingsSlinky.reactInstantsearchCore.anon.Items)
  
  type RefinementValue = js.Function1[
    /* searchState */ typingsSlinky.reactInstantsearchCore.mod.SearchState, 
    typingsSlinky.reactInstantsearchCore.mod.SearchState
  ]
}
