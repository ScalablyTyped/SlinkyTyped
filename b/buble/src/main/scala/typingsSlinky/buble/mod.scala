package typingsSlinky.buble

import typingsSlinky.buble.anon.Arrow
import typingsSlinky.buble.anon.Chrome
import typingsSlinky.magicString.mod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("buble", "transform")
  @js.native
  def transform(content: String): TransformOutput = js.native
  @JSImport("buble", "transform")
  @js.native
  def transform(content: String, options: TransformOptions): TransformOutput = js.native
  
  @js.native
  trait TransformOptions extends StObject {
    
    // input
    var file: js.UndefOr[String] = js.native
    
    // output
    var includeContent: js.UndefOr[Boolean] = js.native
    
    // custom JSX pragma (https://buble.surge.sh/guide/#jsx)
    var jsx: js.UndefOr[String] = js.native
    
    // others
    var namedFunctionExpressions: js.UndefOr[Boolean] = js.native
    
    // default: 'React.createElement'
    // custom `Object.assign` (https://buble.surge.sh/guide/#object-spread-and-rest)
    var objectAssign: js.UndefOr[String | Boolean] = js.native
    
    // used for sourcemaps
    var source: js.UndefOr[String] = js.native
    
    // source: https://github.com/Rich-Harris/buble/blob/master/src/support.js
    var target: js.UndefOr[Chrome] = js.native
    
    // transforms
    var transforms: js.UndefOr[Arrow] = js.native
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
      
      @scala.inline
      def setJsx(value: String): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      @scala.inline
      def setNamedFunctionExpressions(value: Boolean): Self = StObject.set(x, "namedFunctionExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedFunctionExpressionsUndefined: Self = StObject.set(x, "namedFunctionExpressions", js.undefined)
      
      @scala.inline
      def setObjectAssign(value: String | Boolean): Self = StObject.set(x, "objectAssign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectAssignUndefined: Self = StObject.set(x, "objectAssign", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: Chrome): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTransforms(value: Arrow): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    }
  }
  
  @js.native
  trait TransformOutput extends StObject {
    
    var code: String = js.native
    
    var map: SourceMap = js.native
  }
  object TransformOutput {
    
    @scala.inline
    def apply(code: String, map: SourceMap): TransformOutput = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOutput]
    }
    
    @scala.inline
    implicit class TransformOutputMutableBuilder[Self <: TransformOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
}
