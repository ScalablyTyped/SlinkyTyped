package typingsSlinky.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Callback type when fetch is used
    */
  type FetchCallback = js.Function2[
    /* message */ java.lang.String | scala.Double, 
    /* body */ java.lang.String, 
    scala.Unit
  ]
  
  /**
    * Hash of input source(s).  Passing an array of hashes allows you to explicitly specify the order in which the input files
    *  are concatenated. Whereas when you use a single hash the order is determined by the traversal order of object properties
    */
  type Source = /**
    * Path to file
    */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.cleanCss.anon.SourceMap]
  
  /**
    * Union of all types acceptable as input for the minify function
    */
  type Sources = java.lang.String | (js.Array[typingsSlinky.cleanCss.mod.Source | java.lang.String]) | typingsSlinky.cleanCss.mod.Source | typingsSlinky.node.Buffer
}
