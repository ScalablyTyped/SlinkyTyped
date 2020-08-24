organization := "org.scalablytyped.slinky"
name := "aws-sdk__credential-provider-cognito-identity"
version := "0.1.0-preview.2-a0b67e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aws-sdk__client-cognito-identity-browser" % "0.1.0-preview.2-cb735d",
  "org.scalablytyped.slinky" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-ce607c",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-3a791d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
