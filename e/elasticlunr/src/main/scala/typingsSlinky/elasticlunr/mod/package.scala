package typingsSlinky.elasticlunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DocumentReference = java.lang.String | scala.Double
  
  type EventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type FieldSearchConfig[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? {  bool :elasticlunr.elasticlunr.Bool | undefined,   boost :number | undefined}}
    */ typingsSlinky.elasticlunr.elasticlunrStrings.FieldSearchConfig with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type IndexDocuments[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type IndexTokens = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  type InvertedIndexDocs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.elasticlunr.anon.Tf]
  
  type PipelineFunction = js.Function3[
    /* token */ java.lang.String, 
    /* i */ scala.Double, 
    /* tokens */ js.Array[java.lang.String], 
    js.UndefOr[java.lang.String | scala.Null | scala.Unit]
  ]
  
  type SearchScores = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type SerialisedPipeline = js.Array[java.lang.String]
}
