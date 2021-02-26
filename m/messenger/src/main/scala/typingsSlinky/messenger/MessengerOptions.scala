package typingsSlinky.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessengerOptions extends StObject {
  
  /**
    * Extra classes to be appended to the container.
    */
  var extraClasses: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of messages to show at once.
    */
  var maxMessages: js.UndefOr[Double] = js.native
  
  /**
    * Default options for created messages.
    */
  var messageDefaults: js.UndefOr[MessageOptions] = js.native
  
  /**
    * Which locations should be tried when inserting the message container into the page.
    * The default is ['body']. It accepts a list to allow you to try a variety of places
    * when deciding what the optimal location is on any given page. This should generally
    * not need to be changed unless you are inserting the messages into the flow of the
    * document, rather than using messenger-fixed.
    */
  var parentLocations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * What theme are you using? Some themes have associated javascript, specifing this allows that js to run.
    */
  var theme: js.UndefOr[String] = js.native
}
object MessengerOptions {
  
  @scala.inline
  def apply(): MessengerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessengerOptions]
  }
  
  @scala.inline
  implicit class MessengerOptionsMutableBuilder[Self <: MessengerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraClasses(value: String): Self = StObject.set(x, "extraClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraClassesUndefined: Self = StObject.set(x, "extraClasses", js.undefined)
    
    @scala.inline
    def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    @scala.inline
    def setMessageDefaults(value: MessageOptions): Self = StObject.set(x, "messageDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageDefaultsUndefined: Self = StObject.set(x, "messageDefaults", js.undefined)
    
    @scala.inline
    def setParentLocations(value: js.Array[String]): Self = StObject.set(x, "parentLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLocationsUndefined: Self = StObject.set(x, "parentLocations", js.undefined)
    
    @scala.inline
    def setParentLocationsVarargs(value: String*): Self = StObject.set(x, "parentLocations", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
