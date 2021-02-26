package typingsSlinky.pgMinify

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-minify", JSImport.Namespace)
  @js.native
  def apply(sql: String): String = js.native
  @JSImport("pg-minify", JSImport.Namespace)
  @js.native
  def apply(sql: String, options: IMinifyOptions): String = js.native
  
  @JSImport("pg-minify", "SQLParsingError")
  @js.native
  class SQLParsingError () extends Error {
    
    var code: parsingErrorCode = js.native
    
    var error: String = js.native
    
    var position: IErrorPosition = js.native
    
    @JSName("stack")
    var stack_SQLParsingError: String = js.native
  }
  
  @js.native
  sealed trait parsingErrorCode extends StObject
  @JSImport("pg-minify", "parsingErrorCode")
  @js.native
  object parsingErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[parsingErrorCode with Double] = js.native
    
    // Unclosed quoted identifier.
    @js.native
    sealed trait multiLineQI extends parsingErrorCode
    /* 3 */ val multiLineQI: typingsSlinky.pgMinify.mod.parsingErrorCode.multiLineQI with Double = js.native
    
    @js.native
    sealed trait unclosedMLC extends parsingErrorCode
    /* 0 */ val unclosedMLC: typingsSlinky.pgMinify.mod.parsingErrorCode.unclosedMLC with Double = js.native
    
    // Unclosed text block.
    @js.native
    sealed trait unclosedQI extends parsingErrorCode
    /* 2 */ val unclosedQI: typingsSlinky.pgMinify.mod.parsingErrorCode.unclosedQI with Double = js.native
    
    // Unclosed multi-line comment.
    @js.native
    sealed trait unclosedText extends parsingErrorCode
    /* 1 */ val unclosedText: typingsSlinky.pgMinify.mod.parsingErrorCode.unclosedText with Double = js.native
  }
  
  @js.native
  trait IErrorPosition extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object IErrorPosition {
    
    @scala.inline
    def apply(column: Double, line: Double): IErrorPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[IErrorPosition]
    }
    
    @scala.inline
    implicit class IErrorPositionMutableBuilder[Self <: IErrorPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMinifyOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var removeAll: js.UndefOr[Boolean] = js.native
  }
  object IMinifyOptions {
    
    @scala.inline
    def apply(): IMinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMinifyOptions]
    }
    
    @scala.inline
    implicit class IMinifyOptionsMutableBuilder[Self <: IMinifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setRemoveAll(value: Boolean): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    }
  }
}
