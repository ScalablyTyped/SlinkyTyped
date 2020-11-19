package typingsSlinky.lunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfigFunction = js.ThisFunction1[
    /* this */ typingsSlinky.lunr.mod.Builder, 
    /* builder */ typingsSlinky.lunr.mod.Builder, 
    scala.Unit
  ]
  
  type Index = typingsSlinky.lunr.mod.Index_
  
  /**
    * A pipeline function maps lunr.Token to lunr.Token. A lunr.Token contains the token
    * string as well as all known metadata. A pipeline function can mutate the token string
    * or mutate (or add) metadata for a given token.
    *
    * A pipeline function can indicate that the passed token should be discarded by returning
    * null. This token will not be passed to any downstream pipeline functions and will not be
    * added to the index.
    *
    * Multiple tokens can be returned by returning an array of tokens. Each token will be passed
    * to any downstream pipeline functions and all will returned tokens will be added to the index.
    *
    * Any number of pipeline functions may be chained together using a lunr.Pipeline.
    *
    * @param token - A token from the document being processed.
    * @param i - The index of this token in the complete list of tokens for this document/field.
    * @param tokens - All tokens for this document/field.
    */
  type PipelineFunction = js.Function3[
    /* token */ typingsSlinky.lunr.mod.Token, 
    /* i */ scala.Double, 
    /* tokens */ js.Array[typingsSlinky.lunr.mod.Token], 
    scala.Null | typingsSlinky.lunr.mod.Token | js.Array[typingsSlinky.lunr.mod.Token]
  ]
  
  type Query = typingsSlinky.lunr.mod.Query_
}
