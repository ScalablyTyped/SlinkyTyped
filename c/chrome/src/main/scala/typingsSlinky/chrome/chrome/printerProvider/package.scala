package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object printerProvider {
  type CapabilityRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* printerId */ java.lang.String, 
      /* resultCallback */ js.Function1[
        /* capabilities */ typingsSlinky.chrome.chrome.printerProvider.PrinterCapabilities, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrintRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* printJob */ typingsSlinky.chrome.chrome.printerProvider.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type PrinterInfoRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[typingsSlinky.chrome.chrome.printerProvider.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrinterRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[typingsSlinky.chrome.chrome.printerProvider.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
}
