package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.maxmind.responseMod.CountryResponse
  - typingsSlinky.maxmind.responseMod.CityResponse
  - typingsSlinky.maxmind.responseMod.AnonymousIPResponse
  - typingsSlinky.maxmind.responseMod.AsnResponse
  - typingsSlinky.maxmind.responseMod.ConnectionTypeResponse
  - typingsSlinky.maxmind.responseMod.DomainResponse
  - typingsSlinky.maxmind.responseMod.IspResponse
*/
trait Response extends js.Object

object Response {
  @scala.inline
  implicit def apply(value: AnonymousIPResponse): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: AsnResponse): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: CityResponse): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: ConnectionTypeResponse): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: CountryResponse): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: DomainResponse): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: IspResponse): Response = value.asInstanceOf[Response]
}

