package typingsSlinky.conventionalRecommendedBump.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Options {
  type WhatBump = js.Function1[
    /* commits */ js.Array[
      typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol]
    ], 
    typingsSlinky.conventionalRecommendedBump.mod.Options.WhatBump.Result
  ]
}
