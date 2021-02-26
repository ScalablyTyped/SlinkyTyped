package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.dataBufferMod.DataBuffer
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineTransformFeedbackMod {
  
  @JSImport("babylonjs/Engines/Extensions/engine.transformFeedback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Engines/Extensions/engine.transformFeedback", "_forceTransformFeedbackToBundle")
  @js.native
  def forceTransformFeedbackToBundle: Boolean = js.native
  
  @scala.inline
  def forceTransformFeedbackToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceTransformFeedbackToBundle")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /**
        * Begins a transform feedback operation
        * @param usePoints defines if points or triangles must be used
        */
      def beginTransformFeedback(usePoints: Boolean): Unit = js.native
      
      /**
        * Bind a webGL transform feedback object to the webgl context
        * @param value defines the webGL transform feedback object to bind
        */
      def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
      
      /**
        * Bind a webGL buffer for a transform feedback operation
        * @param value defines the webGL buffer to bind
        */
      def bindTransformFeedbackBuffer(value: Nullable[DataBuffer]): Unit = js.native
      
      /**
        * Creates a webGL transform feedback object
        * Please makes sure to check webGLVersion property to check if you are running webGL 2+
        * @returns the webGL transform feedback object
        */
      def createTransformFeedback(): WebGLTransformFeedback = js.native
      
      /**
        * Delete a webGL transform feedback object
        * @param value defines the webGL transform feedback object to delete
        */
      def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
      
      /**
        * Ends a transform feedback operation
        */
      def endTransformFeedback(): Unit = js.native
      
      /**
        * Specify the varyings to use with transform feedback
        * @param program defines the associated webGL program
        * @param value defines the list of strings representing the varying names
        */
      def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
    }
    object Engine {
      
      @scala.inline
      def apply(
        beginTransformFeedback: Boolean => Unit,
        bindTransformFeedback: Nullable[WebGLTransformFeedback] => Unit,
        bindTransformFeedbackBuffer: Nullable[DataBuffer] => Unit,
        createTransformFeedback: () => WebGLTransformFeedback,
        deleteTransformFeedback: WebGLTransformFeedback => Unit,
        endTransformFeedback: () => Unit,
        setTranformFeedbackVaryings: (WebGLProgram, js.Array[String]) => Unit
      ): Engine = {
        val __obj = js.Dynamic.literal(beginTransformFeedback = js.Any.fromFunction1(beginTransformFeedback), bindTransformFeedback = js.Any.fromFunction1(bindTransformFeedback), bindTransformFeedbackBuffer = js.Any.fromFunction1(bindTransformFeedbackBuffer), createTransformFeedback = js.Any.fromFunction0(createTransformFeedback), deleteTransformFeedback = js.Any.fromFunction1(deleteTransformFeedback), endTransformFeedback = js.Any.fromFunction0(endTransformFeedback), setTranformFeedbackVaryings = js.Any.fromFunction2(setTranformFeedbackVaryings))
        __obj.asInstanceOf[Engine]
      }
      
      @scala.inline
      implicit class EngineMutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBeginTransformFeedback(value: Boolean => Unit): Self = StObject.set(x, "beginTransformFeedback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBindTransformFeedback(value: Nullable[WebGLTransformFeedback] => Unit): Self = StObject.set(x, "bindTransformFeedback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBindTransformFeedbackBuffer(value: Nullable[DataBuffer] => Unit): Self = StObject.set(x, "bindTransformFeedbackBuffer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateTransformFeedback(value: () => WebGLTransformFeedback): Self = StObject.set(x, "createTransformFeedback", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDeleteTransformFeedback(value: WebGLTransformFeedback => Unit): Self = StObject.set(x, "deleteTransformFeedback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEndTransformFeedback(value: () => Unit): Self = StObject.set(x, "endTransformFeedback", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetTranformFeedbackVaryings(value: (WebGLProgram, js.Array[String]) => Unit): Self = StObject.set(x, "setTranformFeedbackVaryings", js.Any.fromFunction2(value))
      }
    }
  }
}
