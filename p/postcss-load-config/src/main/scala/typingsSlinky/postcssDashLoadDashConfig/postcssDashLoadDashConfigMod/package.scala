package typingsSlinky.postcssDashLoadDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashLoadDashConfigMod {
  import typingsSlinky.postcss.postcssMod.Plugin
  import typingsSlinky.postcss.postcssMod.ProcessOptions
  import typingsSlinky.postcss.postcssMod.Processor
  import typingsSlinky.postcss.postcssMod.Transformer
  import typingsSlinky.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.from
  import typingsSlinky.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.map
  import typingsSlinky.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.parser
  import typingsSlinky.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.stringifier
  import typingsSlinky.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.syntax
  import typingsSlinky.postcssDashLoadDashConfig.postcssDashLoadDashConfigStrings.to
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  // The full shape of the ConfigContext.
  type ConfigContext = Context with ProcessOptionsPreload with RemainingProcessOptions
  // The remaining ProcessOptions, sans the three above.
  type RemainingProcessOptions = Pick[
    ProcessOptions, 
    Exclude[from | to | parser | stringifier | syntax | map, parser | stringifier | syntax]
  ]
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = Plugin[js.Any] | Transformer | Processor
}
