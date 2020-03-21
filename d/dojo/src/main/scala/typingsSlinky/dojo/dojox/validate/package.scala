package typingsSlinky.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validate {
  type base = typingsSlinky.dojo.dojox.validate.base_
  type br = typingsSlinky.dojo.dojox.validate.br_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/check.html
    *
    * validates user input of an HTML form based on input profile
    * returns an object that contains several methods summarizing the results of the validation
    *
    * @param form form to be validated
    * @param profile specifies how the form fields are to be validated{trim:Array, uppercase:Array, lowercase:Array, ucfirst:Array, digit:Array,required:Array, dependencies:Object, constraints:Object, confirm:Object}
    */
  type check = js.Function2[/* form */ org.scalajs.dom.raw.HTMLFormElement, /* profile */ js.Object, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/isbn.html
    *
    * Validate ISBN-10 or ISBN-13 based on the length of value
    *
    * @param value An ISBN to validate
    */
  type isbn = js.Function1[/* value */ java.lang.String, scala.Unit]
  type regexp = typingsSlinky.dojo.dojox.validate.regexp_
  type us = typingsSlinky.dojo.dojox.validate.us_
  type web = typingsSlinky.dojo.dojox.validate.web_
}
