package typingsSlinky.axeCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CheckLocale = org.scalablytyped.runtime.StringDictionary[typingsSlinky.axeCore.anon.Fail]
  
  type ElementContext = org.scalajs.dom.raw.Node | java.lang.String | typingsSlinky.axeCore.mod.ContextObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.axeCore.axeCoreStrings.minor
    - typingsSlinky.axeCore.axeCoreStrings.moderate
    - typingsSlinky.axeCore.axeCoreStrings.serious
    - typingsSlinky.axeCore.axeCoreStrings.critical
    - scala.Null
  */
  type ImpactValue = typingsSlinky.axeCore.mod._ImpactValue | scala.Null
  
  type RuleLocale = org.scalablytyped.runtime.StringDictionary[typingsSlinky.axeCore.anon.Description]
  
  type RuleObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.axeCore.anon.Enabled]
  
  type RunCallback = js.Function2[/* error */ js.Error, /* results */ typingsSlinky.axeCore.mod.AxeResults, scala.Unit]
  
  type TagValue = java.lang.String
  
  /**
  	 * Function to clean up plugin configuration in document and its subframes
  	 */
  @scala.inline
  def cleanup(): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[scala.Unit]
  
  /**
  	 * Method for configuring the data format used by axe. Helpful for adding new
  	 * rules, which must be registered with the library to execute.
  	 * @param  {Spec}       Spec Object with valid `branding`, `reporter`, `checks` and `rules` data
  	 */
  @scala.inline
  def configure(spec: typingsSlinky.axeCore.mod.Spec): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(spec.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
  	 * Searches and returns rules that contain a tag in the list of tags.
  	 * @param  {Array}  tags  Optional array of tags
  	 * @return {Array}  Array of rules
  	 */
  @scala.inline
  def getRules(): js.Array[typingsSlinky.axeCore.mod.RuleMetadata] = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRules")().asInstanceOf[js.Array[typingsSlinky.axeCore.mod.RuleMetadata]]
  @scala.inline
  def getRules(tags: js.Array[java.lang.String]): js.Array[typingsSlinky.axeCore.mod.RuleMetadata] = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(tags.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.axeCore.mod.RuleMetadata]]
  
  @scala.inline
  def plugins: js.Any = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("plugins").asInstanceOf[js.Any]
  @scala.inline
  def plugins_=(x: js.Any): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  /**
  	 * Function to register a plugin configuration in document and its subframes
  	 * @param  {Object}    plugin    A plugin configuration object
  	 */
  @scala.inline
  def registerPlugin(plugin: typingsSlinky.axeCore.mod.AxePlugin): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
  	 * Restores the default axe configuration
  	 */
  @scala.inline
  def reset(): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[scala.Unit]
  
  /**
  	 * Runs a number of rules against the provided HTML page and returns the resulting issue list
  	 *
  	 * @param   {ElementContext} context  Optional The `Context` specification object @see Context
  	 * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  	 * @param   {RunCallback}    callback Optional The function to invoke when analysis is complete.
  	 * @returns {Promise<AxeResults>|void} If the callback was not defined, axe will return a Promise.
  	 */
  @scala.inline
  def run(): js.Promise[typingsSlinky.axeCore.mod.AxeResults] = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[typingsSlinky.axeCore.mod.AxeResults]]
  @scala.inline
  def run(
    callback: js.Function2[/* error */ js.Error, /* results */ typingsSlinky.axeCore.mod.AxeResults, scala.Unit]
  ): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def run(context: typingsSlinky.axeCore.mod.ElementContext): js.Promise[typingsSlinky.axeCore.mod.AxeResults] = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.axeCore.mod.AxeResults]]
  @scala.inline
  def run(context: typingsSlinky.axeCore.mod.ElementContext, callback: typingsSlinky.axeCore.mod.RunCallback): scala.Unit = (typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def run(context: typingsSlinky.axeCore.mod.ElementContext, options: typingsSlinky.axeCore.mod.RunOptions): js.Promise[typingsSlinky.axeCore.mod.AxeResults] = (typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.axeCore.mod.AxeResults]]
  @scala.inline
  def run(
    context: typingsSlinky.axeCore.mod.ElementContext,
    options: typingsSlinky.axeCore.mod.RunOptions,
    callback: typingsSlinky.axeCore.mod.RunCallback
  ): scala.Unit = (typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def run(options: typingsSlinky.axeCore.mod.RunOptions): js.Promise[typingsSlinky.axeCore.mod.AxeResults] = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.axeCore.mod.AxeResults]]
  @scala.inline
  def run(options: typingsSlinky.axeCore.mod.RunOptions, callback: typingsSlinky.axeCore.mod.RunCallback): scala.Unit = (typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
  	 * Source string to use as an injected script in Selenium
  	 */
  @scala.inline
  def source: java.lang.String = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("source").asInstanceOf[java.lang.String]
  @scala.inline
  def source_=(x: java.lang.String): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typingsSlinky.axeCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
