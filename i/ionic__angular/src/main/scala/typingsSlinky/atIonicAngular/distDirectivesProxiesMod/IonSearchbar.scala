package typingsSlinky.atIonicAngular.distDirectivesProxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.EventEmitter
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import typingsSlinky.atIonicCore.atIonicCoreStrings.decimal
import typingsSlinky.atIonicCore.atIonicCoreStrings.email
import typingsSlinky.atIonicCore.atIonicCoreStrings.none
import typingsSlinky.atIonicCore.atIonicCoreStrings.number
import typingsSlinky.atIonicCore.atIonicCoreStrings.numeric
import typingsSlinky.atIonicCore.atIonicCoreStrings.off
import typingsSlinky.atIonicCore.atIonicCoreStrings.on
import typingsSlinky.atIonicCore.atIonicCoreStrings.password
import typingsSlinky.atIonicCore.atIonicCoreStrings.search
import typingsSlinky.atIonicCore.atIonicCoreStrings.tel
import typingsSlinky.atIonicCore.atIonicCoreStrings.text
import typingsSlinky.atIonicCore.atIonicCoreStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSearchbar")
@js.native
class IonSearchbar protected ()
  extends typingsSlinky.atIonicCore.distTypesComponentsMod.Components.IonSearchbar {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, enable searchbar animation.
    */
  /* CompleteClass */
  override var animated: Boolean = js.native
  /**
    * Set the input's autocomplete property.
    */
  /* CompleteClass */
  override var autocomplete: on | off = js.native
  /**
    * Set the input's autocorrect property.
    */
  /* CompleteClass */
  override var autocorrect: on | off = js.native
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  /* CompleteClass */
  override var cancelButtonIcon: String = js.native
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  /* CompleteClass */
  override var cancelButtonText: String = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  /* CompleteClass */
  override var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the input.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  /* CompleteClass */
  override var inputmode: none | text | tel | url | email | numeric | decimal | search = js.native
  var ionBlur: EventEmitter[CustomEvent] = js.native
  var ionCancel: EventEmitter[CustomEvent] = js.native
  var ionChange: EventEmitter[CustomEvent] = js.native
  var ionClear: EventEmitter[CustomEvent] = js.native
  var ionFocus: EventEmitter[CustomEvent] = js.native
  var ionInput: EventEmitter[CustomEvent] = js.native
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  /* CompleteClass */
  override var placeholder: String = js.native
  /**
    * The icon to use as the search icon.
    */
  /* CompleteClass */
  override var searchIcon: String = js.native
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  /* CompleteClass */
  override var showCancelButton: Boolean | String = js.native
  /**
    * If `true`, enable spellcheck on the input.
    */
  /* CompleteClass */
  override var spellcheck: Boolean = js.native
  /**
    * Set the type of the input.
    */
  /* CompleteClass */
  override var `type`: text | password | email | number | search | tel | url = js.native
  var z: NgZone = js.native
  /**
    * Returns the native `<input>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLInputElement] = js.native
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
}

