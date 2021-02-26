package typingsSlinky.cwiseCompiler

import typingsSlinky.cwiseParser.mod.CompiledRoutine
import typingsSlinky.ndarray.mod.ndarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cwise-compiler", JSImport.Namespace)
  @js.native
  def apply(user_args: UserArgs): js.Function3[
    /* a */ ndarray[Double], 
    /* b */ ndarray[Double], 
    /* repeated */ ndarray[Double], 
    ndarray[Double]
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.array
    - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.offset
    - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.shape
    - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.scalar
    - typingsSlinky.cwiseCompiler.cwiseCompilerStrings.index
    - typingsSlinky.cwiseCompiler.mod.BlockIndice
    - typingsSlinky.cwiseCompiler.mod.OffsetArg
  */
  trait ArgType extends StObject
  
  @js.native
  trait BlockIndice extends ArgType {
    
    var blockIndices: Double = js.native
  }
  object BlockIndice {
    
    @scala.inline
    def apply(blockIndices: Double): BlockIndice = {
      val __obj = js.Dynamic.literal(blockIndices = blockIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockIndice]
    }
    
    @scala.inline
    implicit class BlockIndiceMutableBuilder[Self <: BlockIndice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockIndices(value: Double): Self = StObject.set(x, "blockIndices", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OffsetArg extends ArgType {
    
    var array: Double = js.native
    
    var offset: js.Array[Double] = js.native
  }
  object OffsetArg {
    
    @scala.inline
    def apply(array: Double, offset: js.Array[Double]): OffsetArg = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetArg]
    }
    
    @scala.inline
    implicit class OffsetArgMutableBuilder[Self <: OffsetArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: Double): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Procedure extends StObject {
    
    var argTypes: js.Array[ArgType] = js.native
    
    var arrayArgs: js.Array[Double] = js.native
    
    var arrayBlockIndices: js.Array[Double] = js.native
    
    var blockSize: js.UndefOr[Double] = js.native
    
    var body: CompiledRoutine = js.native
    
    var debug: Boolean = js.native
    
    var funcName: String = js.native
    
    var indexArgs: js.Array[Double] = js.native
    
    var offsetArgIndex: js.Array[Double] = js.native
    
    var offsetArgs: js.Array[OffsetArg] = js.native
    
    var post: CompiledRoutine = js.native
    
    var pre: CompiledRoutine = js.native
    
    var scalarArgs: js.Array[Double] = js.native
    
    var shapeArgs: js.Array[Double] = js.native
    
    var shimArgs: js.Array[String] = js.native
  }
  object Procedure {
    
    @scala.inline
    def apply(
      argTypes: js.Array[ArgType],
      arrayArgs: js.Array[Double],
      arrayBlockIndices: js.Array[Double],
      body: CompiledRoutine,
      debug: Boolean,
      funcName: String,
      indexArgs: js.Array[Double],
      offsetArgIndex: js.Array[Double],
      offsetArgs: js.Array[OffsetArg],
      post: CompiledRoutine,
      pre: CompiledRoutine,
      scalarArgs: js.Array[Double],
      shapeArgs: js.Array[Double],
      shimArgs: js.Array[String]
    ): Procedure = {
      val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], arrayArgs = arrayArgs.asInstanceOf[js.Any], arrayBlockIndices = arrayBlockIndices.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], indexArgs = indexArgs.asInstanceOf[js.Any], offsetArgIndex = offsetArgIndex.asInstanceOf[js.Any], offsetArgs = offsetArgs.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], scalarArgs = scalarArgs.asInstanceOf[js.Any], shapeArgs = shapeArgs.asInstanceOf[js.Any], shimArgs = shimArgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Procedure]
    }
    
    @scala.inline
    implicit class ProcedureMutableBuilder[Self <: Procedure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgTypes(value: js.Array[ArgType]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgTypesVarargs(value: ArgType*): Self = StObject.set(x, "argTypes", js.Array(value :_*))
      
      @scala.inline
      def setArrayArgs(value: js.Array[Double]): Self = StObject.set(x, "arrayArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayArgsVarargs(value: Double*): Self = StObject.set(x, "arrayArgs", js.Array(value :_*))
      
      @scala.inline
      def setArrayBlockIndices(value: js.Array[Double]): Self = StObject.set(x, "arrayBlockIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayBlockIndicesVarargs(value: Double*): Self = StObject.set(x, "arrayBlockIndices", js.Array(value :_*))
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      @scala.inline
      def setBody(value: CompiledRoutine): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncName(value: String): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexArgs(value: js.Array[Double]): Self = StObject.set(x, "indexArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexArgsVarargs(value: Double*): Self = StObject.set(x, "indexArgs", js.Array(value :_*))
      
      @scala.inline
      def setOffsetArgIndex(value: js.Array[Double]): Self = StObject.set(x, "offsetArgIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetArgIndexVarargs(value: Double*): Self = StObject.set(x, "offsetArgIndex", js.Array(value :_*))
      
      @scala.inline
      def setOffsetArgs(value: js.Array[OffsetArg]): Self = StObject.set(x, "offsetArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetArgsVarargs(value: OffsetArg*): Self = StObject.set(x, "offsetArgs", js.Array(value :_*))
      
      @scala.inline
      def setPost(value: CompiledRoutine): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPre(value: CompiledRoutine): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalarArgs(value: js.Array[Double]): Self = StObject.set(x, "scalarArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalarArgsVarargs(value: Double*): Self = StObject.set(x, "scalarArgs", js.Array(value :_*))
      
      @scala.inline
      def setShapeArgs(value: js.Array[Double]): Self = StObject.set(x, "shapeArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeArgsVarargs(value: Double*): Self = StObject.set(x, "shapeArgs", js.Array(value :_*))
      
      @scala.inline
      def setShimArgs(value: js.Array[String]): Self = StObject.set(x, "shimArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimArgsVarargs(value: String*): Self = StObject.set(x, "shimArgs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UserArgs extends StObject {
    
    var args: js.Array[ArgType] = js.native
    
    var blockSize: Double = js.native
    
    var body: CompiledRoutine = js.native
    
    var debug: Boolean = js.native
    
    var funcName: String = js.native
    
    var post: CompiledRoutine = js.native
    
    var pre: CompiledRoutine = js.native
    
    var printCode: js.UndefOr[Boolean] = js.native
  }
  object UserArgs {
    
    @scala.inline
    def apply(
      args: js.Array[ArgType],
      blockSize: Double,
      body: CompiledRoutine,
      debug: Boolean,
      funcName: String,
      post: CompiledRoutine,
      pre: CompiledRoutine
    ): UserArgs = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], blockSize = blockSize.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserArgs]
    }
    
    @scala.inline
    implicit class UserArgsMutableBuilder[Self <: UserArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[ArgType]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: ArgType*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: CompiledRoutine): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncName(value: String): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost(value: CompiledRoutine): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPre(value: CompiledRoutine): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintCode(value: Boolean): Self = StObject.set(x, "printCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintCodeUndefined: Self = StObject.set(x, "printCode", js.undefined)
    }
  }
}
