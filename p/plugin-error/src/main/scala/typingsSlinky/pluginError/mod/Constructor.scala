package typingsSlinky.pluginError.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.pluginError.anon.Optionsmessagestring
import typingsSlinky.pluginError.anon.Optionspluginstringmessag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends /**
  * @param options Options with plugin name and message
  */
Instantiable1[
      /* options */ Optionspluginstringmessag, 
      typingsSlinky.pluginError.anon.PluginError
    ]
     with /**
  * @param plugin Plugin name
  * @param error Base error
  * @param options Error options
  */
/**
  * @param plugin Plugin name
  * @param error Base error, error message, or options with message
  */
Instantiable2[
      /* plugin */ String, 
      (/* error */ js.Error) | (/* error */ Optionsmessagestring) | (/* error */ String), 
      PluginError[
        (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof std.Error ]: undefined}
  */ typingsSlinky.pluginError.pluginErrorStrings.Constructor with TopLevel[js.Any]) | js.Error
      ]
    ]
     with /**
  * @param plugin Plugin name
  * @param error Base error or error message
  * @param options Error options
  */
Instantiable3[
      /* plugin */ String, 
      (/* error */ js.Error) | (/* error */ String), 
      /* options */ Options, 
      PluginError[
        (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof std.Error ]: undefined}
  */ typingsSlinky.pluginError.pluginErrorStrings.Constructor with TopLevel[js.Any]) | js.Error
      ]
    ]

