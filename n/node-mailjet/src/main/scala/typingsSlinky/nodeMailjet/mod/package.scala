package typingsSlinky.nodeMailjet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def connect(apiKey: java.lang.String, apiSecret: java.lang.String): typingsSlinky.nodeMailjet.mod.Email.Client = (typingsSlinky.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiKey.asInstanceOf[js.Any], apiSecret.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeMailjet.mod.Email.Client]
  @scala.inline
  def connect(
    apiKey: java.lang.String,
    apiSecret: java.lang.String,
    options: typingsSlinky.nodeMailjet.mod.ConnectOptions
  ): typingsSlinky.nodeMailjet.mod.Email.Client = (typingsSlinky.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiKey.asInstanceOf[js.Any], apiSecret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeMailjet.mod.Email.Client]
  @scala.inline
  def connect(apiToken: java.lang.String): typingsSlinky.nodeMailjet.mod.SMS.Client = typingsSlinky.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiToken.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeMailjet.mod.SMS.Client]
  @scala.inline
  def connect(apiToken: java.lang.String, options: typingsSlinky.nodeMailjet.mod.ConnectOptions): typingsSlinky.nodeMailjet.mod.SMS.Client = (typingsSlinky.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeMailjet.mod.SMS.Client]
}
