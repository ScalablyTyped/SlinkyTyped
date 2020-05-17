package typingsSlinky.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailerMod {
  type ListHeaders = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.nodemailer.mailerMod.ListHeader | (js.Array[
      js.Array[typingsSlinky.nodemailer.mailerMod.ListHeader] | typingsSlinky.nodemailer.mailerMod.ListHeader
    ])
  ]
  type PluginFunction = js.Function2[
    /* mail */ typingsSlinky.nodemailer.mailMessageMod.^, 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit], 
    scala.Unit
  ]
}
