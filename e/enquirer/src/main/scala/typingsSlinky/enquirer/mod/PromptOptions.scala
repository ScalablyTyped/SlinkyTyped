package typingsSlinky.enquirer.mod

import typingsSlinky.enquirer.enquirerStrings.autocomplete
import typingsSlinky.enquirer.enquirerStrings.confirm
import typingsSlinky.enquirer.enquirerStrings.editable
import typingsSlinky.enquirer.enquirerStrings.form
import typingsSlinky.enquirer.enquirerStrings.input
import typingsSlinky.enquirer.enquirerStrings.invisible
import typingsSlinky.enquirer.enquirerStrings.list
import typingsSlinky.enquirer.enquirerStrings.multiselect
import typingsSlinky.enquirer.enquirerStrings.numeral
import typingsSlinky.enquirer.enquirerStrings.password
import typingsSlinky.enquirer.enquirerStrings.scale
import typingsSlinky.enquirer.enquirerStrings.select
import typingsSlinky.enquirer.enquirerStrings.snippet
import typingsSlinky.enquirer.enquirerStrings.sort
import typingsSlinky.enquirer.enquirerStrings.survey
import typingsSlinky.enquirer.enquirerStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.enquirer.mod.BasePromptOptions
  - typingsSlinky.enquirer.mod.ArrayPromptOptions
  - typingsSlinky.enquirer.mod.BooleanPromptOptions
  - typingsSlinky.enquirer.mod.StringPromptOptions
  - typingsSlinky.enquirer.mod.NumberPromptOptions
  - typingsSlinky.enquirer.mod.SnippetPromptOptions
  - typingsSlinky.enquirer.mod.SortPromptOptions
*/
trait PromptOptions extends js.Object
object PromptOptions {
  
  @scala.inline
  def NumberPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: numeral
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def StringPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: input | invisible | list | password | text
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def SortPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: sort
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def BasePromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: String | js.Function0[String]
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def ArrayPromptOptions(
    choices: js.Array[Choice | String],
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: autocomplete | editable | form | multiselect | select | survey | list | scale
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def SnippetPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: snippet
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def BooleanPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: confirm
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}
