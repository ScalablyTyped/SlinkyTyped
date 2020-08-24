package typingsSlinky.mnemonist.mod

import typingsSlinky.mnemonist.bloomFilterMod.BloomFilterOptions
import typingsSlinky.mnemonist.bloomFilterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "BloomFilter")
@js.native
class BloomFilter protected () extends default {
  // Constructor
  def this(capacity: Double) = this()
  def this(options: BloomFilterOptions) = this()
}

