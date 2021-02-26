package typingsSlinky.pathParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("path-parser/dist/encoding", "decodeParam")
  @js.native
  def decodeParam(param: String, encoding: URLParamsEncodingType): String = js.native
  
  @JSImport("path-parser/dist/encoding", "encodeParam")
  @js.native
  def encodeParam(param: String, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = js.native
  @JSImport("path-parser/dist/encoding", "encodeParam")
  @js.native
  def encodeParam(param: Boolean, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = js.native
  @JSImport("path-parser/dist/encoding", "encodeParam")
  @js.native
  def encodeParam(param: Double, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = js.native
  
  @JSImport("path-parser/dist/encoding", "encodeURIComponentExcludingSubDelims")
  @js.native
  def encodeURIComponentExcludingSubDelims(segment: String): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pathParser.pathParserStrings.default
    - typingsSlinky.pathParser.pathParserStrings.uri
    - typingsSlinky.pathParser.pathParserStrings.uriComponent
    - typingsSlinky.pathParser.pathParserStrings.none
    - typingsSlinky.pathParser.pathParserStrings.legacy
  */
  trait URLParamsEncodingType extends StObject
  object URLParamsEncodingType {
    
    @scala.inline
    def default: typingsSlinky.pathParser.pathParserStrings.default = "default".asInstanceOf[typingsSlinky.pathParser.pathParserStrings.default]
    
    @scala.inline
    def legacy: typingsSlinky.pathParser.pathParserStrings.legacy = "legacy".asInstanceOf[typingsSlinky.pathParser.pathParserStrings.legacy]
    
    @scala.inline
    def none: typingsSlinky.pathParser.pathParserStrings.none = "none".asInstanceOf[typingsSlinky.pathParser.pathParserStrings.none]
    
    @scala.inline
    def uri: typingsSlinky.pathParser.pathParserStrings.uri = "uri".asInstanceOf[typingsSlinky.pathParser.pathParserStrings.uri]
    
    @scala.inline
    def uriComponent: typingsSlinky.pathParser.pathParserStrings.uriComponent = "uriComponent".asInstanceOf[typingsSlinky.pathParser.pathParserStrings.uriComponent]
  }
}
