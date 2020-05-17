package typingsSlinky.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object callback {
  type Cancel = typingsSlinky.std.NonNullable[
    js.UndefOr[
      js.Function2[
        /* index */ typingsSlinky.layuiLayer.layer.Index, 
        /* layero */ typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement], 
        typingsSlinky.layuiLayer.layuiLayerBooleans.`false` | scala.Unit
      ]
    ]
  ]
  type End = typingsSlinky.std.NonNullable[js.UndefOr[js.Function0[scala.Unit]]]
  type Prompt = js.Function3[
    /* value */ java.lang.String, 
    /* index */ typingsSlinky.layuiLayer.layer.Index, 
    /* elem */ typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type Yes = typingsSlinky.std.NonNullable[
    js.UndefOr[
      js.Function2[
        /* index */ typingsSlinky.layuiLayer.layer.Index, 
        /* layero */ typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement], 
        scala.Unit
      ]
    ]
  ]
}
