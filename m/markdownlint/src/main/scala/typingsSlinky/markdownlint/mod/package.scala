package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Configuration object for linting rules. For a detailed schema, see
    * {@link ../schema/markdownlint-config-schema.json}.
    */
  type Configuration = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /**
    * Parses a configuration string and returns a configuration object.
    */
  type ConfigurationParser = js.Function1[/* text */ java.lang.String, typingsSlinky.markdownlint.mod.Configuration]
  
  /**
    * Called with the result of the lint operation.
    */
  type LintCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* results */ js.UndefOr[typingsSlinky.markdownlint.mod.LintResults], 
    scala.Unit
  ]
  
  /**
    * Lint results (for resultVersion 3).
    */
  type LintResults = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.markdownlint.mod.LintError]]
  
  /**
    * markdown-it plugin.
    */
  type Plugin = js.Array[js.Any]
  
  /**
    * Called with the result of the readConfig operation.
    */
  type ReadConfigCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* config */ js.UndefOr[typingsSlinky.markdownlint.mod.Configuration], 
    scala.Unit
  ]
  
  /**
    * Rule configuration.
    */
  type RuleConfiguration = js.Any
  
  /**
    * Function to implement rule logic.
    */
  type RuleFunction = js.Function2[
    /* params */ typingsSlinky.markdownlint.mod.RuleParams, 
    /* onError */ typingsSlinky.markdownlint.mod.RuleOnError, 
    scala.Unit
  ]
  
  /**
    * Error-reporting callback.
    */
  type RuleOnError = js.Function1[/* onErrorInfo */ typingsSlinky.markdownlint.mod.RuleOnErrorInfo, scala.Unit]
  
  /**
    * Function to pretty-print lint results.
    */
  type ToStringCallback = js.Function1[/* ruleAliases */ js.UndefOr[scala.Boolean], java.lang.String]
}
