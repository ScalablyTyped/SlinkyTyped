package typingsSlinky.cloudmersiveVirusApiClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ScanFile = js.Function2[
    /* inputFile */ typingsSlinky.node.Buffer, 
    /* callback */ js.Function3[
      /* error */ js.Any, 
      /* data */ typingsSlinky.cloudmersiveVirusApiClient.mod.VirusScanResult, 
      /* response */ js.Any, 
      js.Any
    ], 
    js.Any
  ]
  
  type ScanFileAdvanced = js.Function3[
    /* inputFile */ typingsSlinky.node.Buffer, 
    /* opts */ typingsSlinky.cloudmersiveVirusApiClient.mod.ScanFileAdvancedOptions, 
    /* callback */ js.Function3[
      /* error */ js.Any, 
      /* data */ typingsSlinky.cloudmersiveVirusApiClient.mod.VirusScanAdvancedResult, 
      /* response */ js.Any, 
      js.Any
    ], 
    js.Any
  ]
  
  type ScanWebsite = js.Function2[
    /* input */ java.lang.String, 
    /* callback */ js.Function3[
      /* error */ js.Any, 
      /* data */ typingsSlinky.cloudmersiveVirusApiClient.mod.WebsiteScanResult, 
      /* response */ js.Any, 
      js.Any
    ], 
    js.Any
  ]
}
