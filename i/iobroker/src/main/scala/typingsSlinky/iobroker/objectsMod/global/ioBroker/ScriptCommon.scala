package typingsSlinky.iobroker.objectsMod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptCommon extends ObjectCommon {
  
  /** If the script uses a compiled language like TypeScript, this contains the compilation output */
  var compiled: js.UndefOr[String] = js.native
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var debug: Boolean = js.native
  
  /** If the script uses a compiled language like TypeScript, this contains the generated declarations (global scripts only) */
  var declarations: js.UndefOr[String] = js.native
  
  /** Whether this script should be executed */
  var enabled: Boolean = js.native
  
  /** The instance id of the instance which executes this script */
  var engine: String = js.native
  
  /** Defines the type of the script, e.g. TypeScript/ts, JavaScript/js or Blockly */
  var engineType: String = js.native
  
  @JSName("name")
  var name_ScriptCommon: String = js.native
  
  /** The source code of this script */
  var source: String = js.native
  
  /** Is used to determine whether a script has changed and needs to be recompiled */
  var sourceHash: js.UndefOr[String] = js.native
  
  var verbose: Boolean = js.native
}
object ScriptCommon {
  
  @scala.inline
  def apply(
    debug: Boolean,
    enabled: Boolean,
    engine: String,
    engineType: String,
    name: String,
    source: String,
    verbose: Boolean
  ): ScriptCommon = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptCommon]
  }
  
  @scala.inline
  implicit class ScriptCommonOps[Self <: ScriptCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineType(value: String): Self = this.set("engineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiled(value: String): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    
    @scala.inline
    def setDeclarations(value: String): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    
    @scala.inline
    def setSourceHash(value: String): Self = this.set("sourceHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceHash: Self = this.set("sourceHash", js.undefined)
  }
}
