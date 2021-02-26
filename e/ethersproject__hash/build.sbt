organization := "org.scalablytyped.slinky"
name := "ethersproject__hash"
version := "5.0.7-9493e9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ethersproject__abstract-provider" % "5.0.6-dc65af",
  "org.scalablytyped.slinky" %%% "ethersproject__abstract-signer" % "5.0.8-fe4d6b",
  "org.scalablytyped.slinky" %%% "ethersproject__bignumber" % "5.0.10-56f20e",
  "org.scalablytyped.slinky" %%% "ethersproject__bytes" % "5.0.6-bf07c3",
  "org.scalablytyped.slinky" %%% "ethersproject__networks" % "5.0.5-eee886",
  "org.scalablytyped.slinky" %%% "ethersproject__properties" % "5.0.5-a901e8",
  "org.scalablytyped.slinky" %%% "ethersproject__transactions" % "5.0.7-99e237",
  "org.scalablytyped.slinky" %%% "ethersproject__web" % "5.0.10-8e2133",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
