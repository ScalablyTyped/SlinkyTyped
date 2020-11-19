package typingsSlinky.grommet.headingMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLHeadingElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6/components/Heading", "Heading")
@js.native
object Heading extends TopLevel[
      ReactComponentClass[
        HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
      ]
    ]
