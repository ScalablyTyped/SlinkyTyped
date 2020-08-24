package typingsSlinky.algoliaClientCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientTransporterOptions = (typingsSlinky.std.Pick[
    typingsSlinky.algoliaTransporter.mod.TransporterOptions, 
    (typingsSlinky.std.Exclude[
      typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.hostsCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.logger | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.requester | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.requestsCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.responsesCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.timeouts | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.hosts | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.headers | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.queryParameters | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.userAgent, 
      typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.headers
    ]) with (typingsSlinky.std.Exclude[
      typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.hostsCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.logger | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.requester | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.requestsCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.responsesCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.timeouts | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.hosts | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.headers | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.queryParameters | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.userAgent, 
      typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.queryParameters
    ]) with (typingsSlinky.std.Exclude[
      typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.hostsCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.logger | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.requester | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.requestsCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.responsesCache | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.timeouts | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.hosts | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.headers | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.queryParameters | typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.userAgent, 
      typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.hosts
    ])
  ]) with typingsSlinky.algoliaClientCommon.anon.Headers
  type CreateClient[TClient, TOptions] = js.Function1[
    /* options */ TOptions with (typingsSlinky.algoliaClientCommon.anon.Methods[
      org.scalablytyped.runtime.StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]], 
      TClient
    ]), 
    TClient with typingsSlinky.algoliaClientCommon.algoliaClientCommonStrings.CreateClient with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
  type Wait[TResponse] = js.Function2[
    /* response */ TResponse, 
    /* requestOptions */ js.UndefOr[typingsSlinky.algoliaTransporter.mod.RequestOptions], 
    typingsSlinky.algoliaClientCommon.anon.ReadonlyPromiseany
  ]
}
