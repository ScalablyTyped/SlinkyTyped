package typingsSlinky.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jimpCore.etcMod.ChangeName
import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.jimpCore.etcMod.ListenableName
import typingsSlinky.jimpCore.etcMod.ListenerData
import typingsSlinky.jimpCore.jimpCoreStrings.`before-change`
import typingsSlinky.jimpCore.jimpCoreStrings.changed
import typingsSlinky.jimpCore.jimpCoreStrings.clone
import typingsSlinky.jimpCore.jimpCoreStrings.constructor
import typingsSlinky.jimpCore.pluginsMod.JimpPlugin
import typingsSlinky.jimpCore.pluginsMod.JimpType
import typingsSlinky.jimpCore.utilsMod.FunctionRet
import typingsSlinky.jimpCore.utilsMod.GetPluginFuncArrDecoders
import typingsSlinky.jimpCore.utilsMod.GetPluginFuncArrEncoders
import typingsSlinky.jimpCore.utilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var `class`: /* import warning: importer.ImportType#apply Failed type conversion: infer Class */ js.Any = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(
      `class`: /* import warning: importer.ImportType#apply Failed type conversion: infer Class */ js.Any
    ): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: /* import warning: importer.ImportType#apply Failed type conversion: infer Class */ js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Class extends StObject {
    
    var `class`: js.UndefOr[scala.Nothing] = js.native
    
    var constants: js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  trait Constants extends StObject {
    
    var constants: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any = js.native
  }
  object Constants {
    
    @scala.inline
    def apply(
      constants: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any
    ): Constants = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    @scala.inline
    implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any
      ): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Decoders extends StObject {
    
    var decoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any = js.native
  }
  object Decoders {
    
    @scala.inline
    def apply(
      decoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any
    ): Decoders = {
      val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoders]
    }
    
    @scala.inline
    implicit class DecodersMutableBuilder[Self <: Decoders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecoders(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any
      ): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DecodersEncoders[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] extends StObject {
    
    var decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]] = js.native
    
    var encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]] = js.native
  }
  object DecodersEncoders {
    
    @scala.inline
    def apply[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */](
      decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]],
      encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]
    ): DecodersEncoders[PluginFuncArr] = {
      val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodersEncoders[PluginFuncArr]]
    }
    
    @scala.inline
    implicit class DecodersEncodersMutableBuilder[Self <: DecodersEncoders[_], PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] (val x: Self with DecodersEncoders[PluginFuncArr]) extends AnyVal {
      
      @scala.inline
      def setDecoders(value: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoders(value: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey[T /* <: ListenableName */]
    extends /* key */ StringDictionary[js.Any]
       with ListenerData[T] {
    
    var eventName: `before-change` | changed = js.native
    
    var methodName: T = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): Dictkey[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey[T]]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey[_], T /* <: ListenableName */] (val x: Self with Dictkey[T]) extends AnyVal {
      
      @scala.inline
      def setEventName(value: `before-change` | changed): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: T): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Encoders extends StObject {
    
    var encoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any = js.native
  }
  object Encoders {
    
    @scala.inline
    def apply(
      encoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any
    ): Encoders = {
      val __obj = js.Dynamic.literal(encoders = encoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoders]
    }
    
    @scala.inline
    implicit class EncodersMutableBuilder[Self <: Encoders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoders(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any
      ): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventName[T /* <: ListenableName */] extends ListenerData[T] {
    
    var eventName: T = js.native
    
    var methodName: clone | ChangeName | constructor = js.native
  }
  object EventName {
    
    @scala.inline
    def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): EventName[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventName[T]]
    }
    
    @scala.inline
    implicit class EventNameMutableBuilder[Self <: EventName[_], T /* <: ListenableName */] (val x: Self with EventName[T]) extends AnyVal {
      
      @scala.inline
      def setEventName(value: T): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: clone | ChangeName | constructor): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<{  class :any}> */
  @js.native
  trait Requiredclassany extends StObject {
    
    var `class`: js.Any = js.native
  }
  object Requiredclassany {
    
    @scala.inline
    def apply(`class`: js.Any): Requiredclassany = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Requiredclassany]
    }
    
    @scala.inline
    implicit class RequiredclassanyMutableBuilder[Self <: Requiredclassany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<{  constants :any}> */
  @js.native
  trait Requiredconstantsany extends StObject {
    
    var constants: js.Any = js.native
  }
  object Requiredconstantsany {
    
    @scala.inline
    def apply(constants: js.Any): Requiredconstantsany = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
      __obj.asInstanceOf[Requiredconstantsany]
    }
    
    @scala.inline
    implicit class RequiredconstantsanyMutableBuilder[Self <: Requiredconstantsany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(value: js.Any): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
