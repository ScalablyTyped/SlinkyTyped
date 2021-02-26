organization := "org.scalablytyped.slinky"
name := "algolia__client-common"
version := "4.8.0-1030ed"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "algolia__cache-common" % "4.8.0-465033",
  "org.scalablytyped.slinky" %%% "algolia__logger-common" % "4.8.0-8f6d0e",
  "org.scalablytyped.slinky" %%% "algolia__requester-common" % "4.8.0-c5dcf5",
  "org.scalablytyped.slinky" %%% "algolia__transporter" % "4.8.0-5a108a",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
