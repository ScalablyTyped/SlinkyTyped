package typingsSlinky.nextAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object providersMod {
  
  @scala.inline
  def default: typingsSlinky.nextAuth.providersMod.Providers = typingsSlinky.nextAuth.providersMod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[typingsSlinky.nextAuth.providersMod.Providers]
  
  /**
    * Apple
    */
  type Apple = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderAppleOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Auth0
    */
  type Auth0 = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderAuth0Options, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Basecamp
    */
  type Basecamp = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderBasecampOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Battle.net
    */
  type BattleNet = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderBattleNetOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Box
    */
  type Box = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderBoxOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Cognito
    */
  type Cognito = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderCognitoOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  type CredentialInput = org.scalablytyped.runtime.StringDictionary[typingsSlinky.nextAuth.anon.Label]
  
  /**
    * Credentials
    */
  type Credentials = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderCredentialsOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Discord
    */
  type Discord = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderDiscordOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Email
    */
  type Email = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderEmailOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Facebook
    */
  type Facebook = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderFacebookOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  // TODO: type return objects from providers properly
  type GenericReturnConfig = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /**
    * GitHub
    */
  type GitHub = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderGitHubOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * GitLab
    */
  type GitLab = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderGitLabOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Google
    */
  type Google = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderGoogleOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * IS4
    */
  type IdentityServer4 = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderIS4Options, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * LinkedIn
    */
  type LinkedIn = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderLinkedInOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Mixer
    */
  type Mixer = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderMixerOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Okta
    */
  type Okta = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderOktaOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  type PossibleProviders = typingsSlinky.nextAuth.providersMod.Slack | typingsSlinky.nextAuth.providersMod.IdentityServer4 | typingsSlinky.nextAuth.providersMod.Credentials | typingsSlinky.nextAuth.providersMod.Mixer | typingsSlinky.nextAuth.providersMod.Cognito | typingsSlinky.nextAuth.providersMod.Reddit | typingsSlinky.nextAuth.providersMod.Basecamp | typingsSlinky.nextAuth.providersMod.GitHub | typingsSlinky.nextAuth.providersMod.Google | typingsSlinky.nextAuth.providersMod.Spotify | typingsSlinky.nextAuth.providersMod.Box | typingsSlinky.nextAuth.providersMod.Twitch | typingsSlinky.nextAuth.providersMod.Yandex | typingsSlinky.nextAuth.providersMod.Apple | typingsSlinky.nextAuth.providersMod.LinkedIn | typingsSlinky.nextAuth.providersMod.BattleNet | typingsSlinky.nextAuth.providersMod.Discord | typingsSlinky.nextAuth.providersMod.Okta | typingsSlinky.nextAuth.providersMod.Facebook | typingsSlinky.nextAuth.providersMod.Email | typingsSlinky.nextAuth.providersMod.Twitter | typingsSlinky.nextAuth.providersMod.Auth0 | typingsSlinky.nextAuth.providersMod.GitLab
  
  /**
    * Reddit
    */
  type Reddit = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderRedditOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Slack
    */
  type Slack = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderSlackOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Spotify
    */
  type Spotify = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderSpotifyOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Twitch
    */
  type Twitch = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderTwitchOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Twitter
    */
  type Twitter = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderTwitterOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
  
  /**
    * Yandex
    */
  type Yandex = js.Function1[
    /* options */ typingsSlinky.nextAuth.providersMod.ProviderYandexOptions, 
    typingsSlinky.nextAuth.providersMod.GenericReturnConfig
  ]
}
