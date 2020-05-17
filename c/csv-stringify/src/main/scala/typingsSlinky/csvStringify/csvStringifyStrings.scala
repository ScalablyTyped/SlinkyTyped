package typingsSlinky.csvStringify

import typingsSlinky.csvStringify.es5Mod.RecordDelimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object csvStringifyStrings {
  @js.native
  sealed trait ascii
    extends RecordDelimiter
       with typingsSlinky.csvStringify.mod.RecordDelimiter
  
  @js.native
  sealed trait auto
    extends RecordDelimiter
       with typingsSlinky.csvStringify.mod.RecordDelimiter
  
  @js.native
  sealed trait mac
    extends RecordDelimiter
       with typingsSlinky.csvStringify.mod.RecordDelimiter
  
  @js.native
  sealed trait unicode
    extends RecordDelimiter
       with typingsSlinky.csvStringify.mod.RecordDelimiter
  
  @js.native
  sealed trait unix
    extends RecordDelimiter
       with typingsSlinky.csvStringify.mod.RecordDelimiter
  
  @js.native
  sealed trait windows
    extends RecordDelimiter
       with typingsSlinky.csvStringify.mod.RecordDelimiter
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def mac: mac = "mac".asInstanceOf[mac]
  @scala.inline
  def unicode: unicode = "unicode".asInstanceOf[unicode]
  @scala.inline
  def unix: unix = "unix".asInstanceOf[unix]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

