package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object otplibPresetV11 {
  
  type createHmacSecret = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplibPresetV11.HmacOptions, 
    typingsSlinky.node.Buffer
  ]
  
  type hotpCheck = js.Function4[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsSlinky.otplibPresetV11.HotpOptionsInterface, 
    scala.Boolean
  ]
  
  type hotpCounter = js.Function1[/* counter */ scala.Double, java.lang.String]
  
  type hotpDigest = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsSlinky.otplibPresetV11.HotpOptionsInterface, 
    java.lang.String
  ]
  
  type hotpOptions = js.Function1[/* options */ js.Any, typingsSlinky.otplibPresetV11.HotpOptionsInterface]
  
  type hotpSecret = typingsSlinky.otplibPresetV11.createHmacSecret
  
  type hotpToken = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsSlinky.otplibPresetV11.HotpOptionsInterface, 
    java.lang.String
  ]
  
  type totpCheck = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplibPresetV11.TotpOptionsInterface, 
    scala.Boolean
  ]
  
  type totpCheckWithWindow = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplibPresetV11.TotpOptionsInterface, 
    scala.Double | scala.Null
  ]
  
  type totpCounter = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  
  type totpOptions = js.Function1[/* options */ js.Any, typingsSlinky.otplibPresetV11.TotpOptionsInterface]
  
  type totpSecret = typingsSlinky.otplibPresetV11.createHmacSecret
  
  type totpTimeRemaining = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  
  type totpTimeUsed = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  
  type totpToken = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplibPresetV11.TotpOptionsInterface, 
    java.lang.String
  ]
}
