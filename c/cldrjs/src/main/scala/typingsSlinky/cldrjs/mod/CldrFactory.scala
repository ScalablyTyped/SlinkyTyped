package typingsSlinky.cldrjs.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.cldrjs.cldrjsStrings._underscore
import typingsSlinky.cldrjs.cldrjsStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @name CldrFactory
  * @memberof cldr
  * @kind inteface
  *
  * @description
  * The factory for {@link cldr.CldrStatic} class.
  */
@js.native
trait CldrFactory
  extends /**
  * @name constructor
  * @memberof cldr.CldrFactory
  * @kind function
  * @access public
  *
  * @description
  * The constructor function for {@link cldr.CldrStatic} class.
  *
  * @param {string} locale The locale name that was previously loaded.
  *
  * @returns {cldr.CldrStatic} The instance of {@link cldr.CldrStatic} class.
  */
Instantiable1[/* locale */ String, CldrStatic] {
  
  /**
    * @name load
    * @memberof cldr.CldrFactory
    * @kind function
    * @access public
    *
    * @description
    * Load the CLDR content in the form of JSON.
    *
    * @param {any} json The json content.
    * @param {Array<any>} otherJson Optional. The parts of the JSON.
    *
    * @returns {void}
    */
  def load(json: js.Any, otherJson: js.Any*): Unit = js.native
  
  /**
    * Allow user to override locale separator "-" (default) | "_".
    * According to http://www.unicode.org/reports/tr35/#Unicode_language_identifier, both "-" and "_" are valid locale separators (eg. "en_GB", "en-GB").
    * According to http://unicode.org/cldr/trac/ticket/6786 its usage must be consistent throughout the data set.
    */
  var localeSep: `-_` | _underscore = js.native
  
  def off(event: String, listener: js.Function2[/* path */ String, /* value */ js.Any, Unit]): Unit = js.native
  
  def on(event: String, listener: js.Function2[/* path */ String, /* value */ js.Any, Unit]): Unit = js.native
  
  def once(event: String, listener: js.Function2[/* path */ String, /* value */ js.Any, Unit]): Unit = js.native
}
