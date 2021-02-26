package typingsSlinky.babelPluginMacros

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babelCore.mod.NodePath
import typingsSlinky.babelCore.mod.PluginObj
import typingsSlinky.babelCore.mod.PluginPass
import typingsSlinky.babelPluginMacros.anon.TypeofBabel
import typingsSlinky.babelPluginMacros.anon.defaultArrayNodePathNodeR
import typingsSlinky.babelTypes.mod.Node
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-plugin-macros", JSImport.Namespace)
  @js.native
  def apply(babel: TypeofBabel, options: js.Any): PluginObj[PluginPass] = js.native
  
  @JSImport("babel-plugin-macros", "MacroError")
  @js.native
  class MacroError () extends Error
  
  @JSImport("babel-plugin-macros", "createMacro")
  @js.native
  def createMacro(handler: MacroHandler): js.Any = js.native
  @JSImport("babel-plugin-macros", "createMacro")
  @js.native
  def createMacro(handler: MacroHandler, options: Options): js.Any = js.native
  
  type MacroHandler = js.Function1[/* params */ MacroParams, Unit]
  
  @js.native
  trait MacroParams extends StObject {
    
    var babel: TypeofBabel = js.native
    
    var config: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var references: defaultArrayNodePathNodeR = js.native
    
    var state: PluginPass = js.native
  }
  object MacroParams {
    
    @scala.inline
    def apply(babel: TypeofBabel, references: defaultArrayNodePathNodeR, state: PluginPass): MacroParams = {
      val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacroParams]
    }
    
    @scala.inline
    implicit class MacroParamsMutableBuilder[Self <: MacroParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabel(value: TypeofBabel): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setReferences(value: defaultArrayNodePathNodeR): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: PluginPass): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var configName: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
    }
  }
  
  type References = StringDictionary[js.Array[NodePath[Node]]]
}
