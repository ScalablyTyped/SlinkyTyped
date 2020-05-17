package typingsSlinky.mendixmodelsdk.anon

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiable[CT /* <: AbstractModel with IT */, IT /* <: IAbstractModel */] extends Instantiable3[
      /* _client */ IModelServerClient, 
      /* _errorHandler */ IErrorCallback, 
      /* _connectionConfig */ ISdkConfig, 
      CT
    ]

